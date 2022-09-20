
load("trainingData.RData")

lm <- lm(weight ~ length + height , data = data)
lm$t