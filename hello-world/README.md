# Kotlin/Native Hello World

Things to note: 

- Konan, a Kotlin/Native compiler is used to create a Kotlin executable (see `build.gradle`)
- As this is not a multiplatform project, only the platform you're running on is targeted - see `build/` folder
- `"Hello, Kotlin/Native!"` is a [Kotlin/Native String](https://github.com/JetBrains/kotlin-native/blob/master/runtime/src/main/kotlin/kotlin/String.kt) and not its JVM counterpart.
- `Array<String>` will be mapped to `CPointer<T>?` in e.g. unix environment
