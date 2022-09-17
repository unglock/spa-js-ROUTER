set.seed(200)

length <- round(rnorm(100, 88, 5), 3)
height <- round(rnorm(100, 19, 1), 3)
error <- round(rnorm(100, 0, 0.1), 3)

weight <- 0.05 * length +