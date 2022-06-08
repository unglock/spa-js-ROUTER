load("dataAnalyzed.RData")

library(ggplot2)

# Model triggered
# id: 44 to 73

# Model applied
# id : 77

# because id != data index
# we need to subtract every time 11

ggplot() +
  geom_rect(aes(xmin = 33, xmax = 62, ymin = -Inf, ymax = Inf), fill = "#00AFBA", alpha = 0.7) +
  geom_rect(aes(xmin = 12, xmax = 62, ymin = -Inf, ymax = Inf), fill = "#00AFBA", alpha = 0.5) +
  geom_rect(aes(xmin = 62, xmax = 66, ymin = -Inf, ymax = Inf), fill = "#C5832E", alpha = 0.7) +
  annotate("text", x = 64, y = 1.1, label = "Retraining", color = "#173361") +
  annotate("text", x = 4