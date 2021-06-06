# Pexa - Plugin EXtensible Architecture

<p>
  <a href="https://github.com/thelotusgg/babylon/blob/dev/README.md" target="_blank">
    <img alt="Documentation" src="https://img.shields.io/badge/documentation-yes-brightgreen.svg" />
  </a>
  <a href="https://github.com/thelotusgg/babylon/blob/dev/LICENSE" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
  </a>
</p>

Pexa was started to provide a base for multiple projects planned by
[The Lotus](https://github.com/thelotusgg).
Our goal is to provide a fully functional server with a plugin system and basic logging, REST and event functionality.

## Prerequisites

* JDK 15
* Maven
* Lombok Plugin (for your IDE)

## How to compile

Simply run:
> mvn clean install

## How to run

The core module, which can be invoked by running "java -jar your-core.jar", can be executed in any arbitrary directory.
When starting the server, the core will search for plugins in the "plugins" directory.

---
## Modules

### Bootstrap

The bootstrap module is just for testing purposes. It will load the health-plugin into the plugin directory and start
the server.

### Health Plugin

The health plugin provides basic isAlive and isHealthy functionality.

---

## Author

👤 **The Lotus Dev Team**

* Github: [@thelotusgg](https://github.com/)

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/thelotusgg/core-server/issues). You can also take a look at the contributing guide.

## Show your support

Give a ⭐️ if this project helped you!

## 📝 License

Copyright © 2021 [The Lotus Dev Team](https://github.com/thelotusgg).<br />
This project is [MIT](https://github.com/thelotusgg/core-server/blob/dev/LICENSE) licensed.
