# Load Testing Examples

This repository contains basic load testing scripts using four popular tools:

- [K6](./k6/)
- [Gatling](./gatling/)
- [Locust](./locust/)
- [Artillery](./artillery/)

Each tool has a basic scenario that targets [https://test.k6.io](https://test.k6.io), and includes:
- A minimal test script
- Setup instructions
- Run commands

Choose the tool that fits your requirements or compare them side by side.

---

## Quick Start

| Tool      | Language       | Run Command                          |
|-----------|----------------|---------------------------------------|
| K6        | JavaScript     | `k6 run script.js > report.txt`                 |
| Gatling   | Scala (JVM)    | `./bin/gatling.sh` (from Gatling dir)|
| Locust    | Python         | `locust -f locustfile.py --headless -u 10 -r 2 --host=https://test.k6.io --run-time 30s` |
| Artillery | YAML/Node.js   | `artillery report --output report.html report.json` |

