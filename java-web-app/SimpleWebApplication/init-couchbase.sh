#!/bin/bash

# this script is for the purposes of initializing a default couchbase cluster

# wait 15 for DB to start
sleep 15

echo "Initializing Couchbase DB"

/opt/couchbase/bin/couchbase-cli cluster-init \
  --cluster localhost \
  --cluster-username admin \
  --cluster-password password \
  --services data,index,query \
  --cluster-ramsize 512 \
  --cluster-index-ramsize 256

echo "Creating bucket..."
/opt/couchbase/bin/couchbase-cli bucket-create \
  --cluster localhost \
  --username admin \
  --password password \
  --bucket users \
  --bucket-type couchbase \
  --bucket-ramsize 256

echo "Couchbase initialized successfully"


# keep couchbase container running, suppressing messages/logs
tail -f /dev/null
