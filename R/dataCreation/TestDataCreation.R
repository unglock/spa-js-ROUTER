install.packages("jsonlite")
install.packages("readr")
library(jsonlite)
library(readr)


# Salmon first shift: 2 min
set.seed(101)

length <- round(rnorm(60, 88, 5), 3)
height <- round(rnorm(60, 19, 1), 3)
error <- roun