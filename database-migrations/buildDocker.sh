#!/bin/bash

IMAGE_NAME="money-manager-db-migrations"

docker build -t $IMAGE_NAME . || exit

echo "Now you can run your container: 'docker run -it --rm $IMAGE_NAME  -url=jdbc:postgresql://DB_HOST:5432/money_manager -user=USER migrate'"
