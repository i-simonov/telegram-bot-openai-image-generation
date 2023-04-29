# Telegram Bot using OpenAI GPT-4 Image Generation

This GitHub repository contains a simple implementation of a Telegram bot that generates images using OpenAI's GPT-4 image generation model. The bot listens to incoming messages, uses the message text as a prompt, and returns a generated image URL.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)

## Prerequisites

Before you get started, make sure you have:

- A Telegram bot token. Learn how to create a bot and get a token by following the [official guide](https://core.telegram.org/bots#creating-a-new-bot).
- An OpenAI API token. You can get your token by signing up for an API key at the [OpenAI website](https://beta.openai.com/signup/).

## Installation

To use the bot, clone the repository:

\```bash
git clone https://github.com/username/telegram-bot-openai-image-generation.git
\```

Change to the project directory:

\```bash
cd telegram-bot-openai-image-generation
\```

Ensure you have the required dependencies installed on your machine:

- Java Development Kit (JDK) 8 or higher
- Gradle

## Configuration

Update the following placeholders in the `TelegramBot1CDaleeBot` and `OpenAiApiDalee` classes with your actual bot and API tokens:

- `<YOUR TELEGRAM BOT USERNAME>`
- `<YOUR TELEGRAM BOT TOKEN>`
- `<YOUR OpenAI TOKEN>`

## Usage

To run the bot, open a terminal in the project directory and execute:

\```bash
gradle clean build
\```

After the build process is completed, run the application:

\```bash
java -cp build/libs/app.jar telegram-bot-openai-image-generation.App
\```

The bot should now be up and running. To test it, send a message to your bot in Telegram with a text prompt, and the bot will generate an image URL based on the prompt.

## License

This project is released under the MIT License. See [LICENSE](LICENSE) for more details.
