#!/bin/bash

# Variables
NAMESPACE="default"
RELEASE_NAME="my-spring-boot-app"

# Update Helm repositories
helm repo update

# Install or upgrade the Helm chart
helm upgrade --install $RELEASE_NAME ./my-spring-boot-app \
  --namespace $NAMESPACE \
  --create-namespace \
  --values ./my-spring-boot-app/values.yaml

# Verify the deployment
kubectl get all -n $NAMESPACE

