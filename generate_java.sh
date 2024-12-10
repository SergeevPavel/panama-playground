#!/usr/bin/env bash

cd panama-rs
./generate_header.sh
cd ..

jextract \
--include-dir /Library/Developer/CommandLineTools/usr/lib/clang/16.0.0/include \
--dump-includes headers.txt \
panama-rs/headers/panama_header.h

grep "panama_header.h$" headers.txt > filtered_headers.txt

rm -rf app/src/main/java/*

jextract \
  --include-dir /Library/Developer/CommandLineTools/usr/lib/clang/16.0.0/include \
  --output app/src/main/java \
  --target-package org.example.panama \
  --library panama_rs \
  @filtered_headers.txt \
  panama-rs/headers/panama_header.h
