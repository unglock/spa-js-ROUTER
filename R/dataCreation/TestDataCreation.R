install.packages("jsonlite")
install.packages("readr")
library(jsonlite)
library(readr)


# Salmon first shift: 2 min
set.seed(101)

length <- round(rnorm(60, 88, 5), 3)
height <- round(rnorm(60, 19, 1), 3)
error <- round(rnorm(60, 0, 0.1), 3)
weight <- 0.05 * length + 0.01 * height + error

data1 <- data.frame(species = "salmon", id = seq(1, 60), length = length, height = height, weight = weight)


# Walleye second shift : 2 min
set.seed(102)

length <- round(rnorm(60, 81, 8), 3)
heig