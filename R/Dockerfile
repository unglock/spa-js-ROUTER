# Base image, see https://hub.docker.com/r/rocker/rstudio
FROM rocker/rstudio:4.0.3

# Install Plumber
RUN apt-get -y update && apt-get install -y \
   r-cran-rjava \
   && apt-get clean \
   && rm -rf /var/lib/apt/lists/

RUN R -e "install.packages(c('plumber', 'mongolite', 'dplyr'))"

COPY ./Predictor.R /home
COPY ./main.R /home
COPY ./model.RData /home


# open port 8000 to traffic
EXPOSE 8000

ENTRYPOINT ["Rscript", "/home/main.R"]