#!/bin/bash

# this script is for the purposes of initializing a default couchbase cluster

# wait 15 for DB to start
sleep 15

# initialize cluster
couchbase-cli cluster-init -c 127.0.0.1 \
  --cluster-username admin \
  --cluster-password password \
  --services data,index,query \
  --cluster-ramsize 512 \
  --cluster-index-ramsize 256 || true
# no trailing backslashes \ at end of final command

# create couchbase bucket
couchbase-cli bucket-create -c 127.0.0.1 \
  --username admin \
  --password password \
  --bucket users \
  --bucket-type couchbase \
  --bucket-ramsize 256 || true

# keep couchbase container running, suppressing messages/logs
tail -f /dev/null
