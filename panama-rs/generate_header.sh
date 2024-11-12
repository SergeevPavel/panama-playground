#!/usr/bin/env bash

cargo build
cbindgen --config cbindgen.toml --crate panama-rs --lang c --output headers/panama_header.h