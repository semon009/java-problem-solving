# Hidden Enum Counter (STAR Prefix)

A Java application that iterates over a hidden/custom `Secret` enum and counts all constants whose string names begin with the prefix **"STAR"**.

## Features

* Uses `Secret.values()` to traverse through all enum entries dynamically.
* Leverages `name().startsWith("STAR")` to check string prefixes.
* Demonstrates string reflection methods available on Java `Enum` instances.

## Expected Output

Given the sample `Secret` enum (`STAR`, `CRASH`, `START`, `STARLIGHT`, `MOON`), the output is:

```text
3
