#!/bin/bash

export PROJECT="$1"
export FUNCTION="$2"
export ENTRY_POINT="$3"

gcloud config set project $PROJECT

gcloud alpha functions deploy "$FUNCTION" --entry-point "$ENTRY_POINT"  --runtime java11 --region=us-central1 --trigger-http --allow-unauthenticated

TRIGGER_URL=$(gcloud alpha functions describe "$FUNCTION" --format='value(httpsTrigger.url)')

echo 'trigger url: ' "$TRIGGER_URL"
