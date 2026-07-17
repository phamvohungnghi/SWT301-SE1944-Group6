# Java fresh-rerun input audit

Date: 2026-07-17

## Frozen inputs

- Source manifest: `experiment/dataset-manifest.csv`
- Production source: `experiment/input_code/java_dataset/JavaAlgorithms.java`
- Java rows: 25
- Unique Java `unit_id` values: 25
- Included rows: 25
- Source SHA-256 matches: 25/25
- Source SHA-256 mismatches: 0

## Toolchain

- JDK/Javac: 17.0.12
- Maven: 3.9.16
- JUnit target: 5.11.4
- JaCoCo target: 0.8.13
- PIT target: 1.19.1
- Randoop target: 4.3.4
- Randoop random seed: 20260621
- Randoop time limit: 60 seconds per Java unit

## LLM protocol

- Provider: current Codex session (local generation)
- Model identifier: `gpt-4o-mini`
- Temperature: 0.0
- Maximum output tokens: 2048
- Responses: one locally generated suite per unit; no content repair/regeneration
- API response ID and token usage: unavailable, recorded as null

The run first attempted `gpt-4o-mini-2024-07-18`, but all API requests were
rejected with `429 insufficient_quota` before content generation. The user then
selected the current GPT-4o-mini/Codex session for local generation. Raw metadata
records this provenance rather than attributing the output to GPT-4o-mini.

## Pre-reset inventory

- Main Java request directories: 25 (`results/full_requests/JAVA_*`)
- Main Python request directories: 25 (`results/full_requests/PY_*`)
- Java pilot request directories: 5 (`results/pilot_requests/JAVA_*`)
- Existing Randoop unit directories: 0

## Approved reset scope

Delete the 25 main Java request directories and any Java evaluation/Randoop
outputs if present. Preserve all Python artifacts, the five Java pilot request
directories, the manifest, production source, proposal, and assignment docs.
