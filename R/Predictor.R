
## predict the weight

#' @param length
#' @param height
#' @param species
#' @serializer unboxedJSON
#' @get /prediction
predictWeight <- function(length, height, species){
  
  tryCatch(
    {
      length <- as.numeric(length)
      height <- as.numeric(height)
      species <- as.factor(species)
      
      load("/home/model.RData")
      
      prediction <- predict(lm, data.frame(length = length, height = height, species = species))
      return(list(Weight = prediction, ModelTime = lm$time))
    },
    error = function(cond){
      
      message("Prediction did not work")
      return(NA)
    }
  )
}



## retrain model

#' @post /train
train <- function(){
  library(mongolite)
  library(dplyr)
  