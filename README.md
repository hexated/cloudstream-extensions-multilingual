# Cloudstream Non-English Plugin Repository

All available repositories: https://recloudstream.github.io/repos/

Plugin json: https://raw.githubusercontent.com/recloudstream/cloudstream-extensions/builds/plugins.json

Not all extractors are included, only those need to compile. We need to use loadExtractor in the future.

## Getting started with writing your first plugin

1. Open the root build.gradle.kts, read the comments and replace all the placeholders
2. Familiarize yourself with the project structure. Most files are commented
3. Build or deploy your first plugin using:
   - Windows: `.\gradlew.bat ExampleProvider:make` or `.\gradlew.bat ExampleProvider:deployWithAdb`
   - Linux & Mac: `./gradlew ExampleProvider:make` or `./gradlew ExampleProvider:deployWithAdb`

## License

Everything in this repo is released into the public domain. You may use it however you want with no conditions whatsoever


## Attribution

This template as well as the gradle plugin and the whole plugin system is **heavily** based on [Aliucord](https://github.com/Aliucord).
*Go use it, it's a great mobile discord client mod!*
