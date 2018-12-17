# Kotlin/Native + libcurl

Things to note (assuming you've already checked the `hello-world` example):

- the definition (`.def`) file is used to generate Kotlin bindings for any C headers you want to access. It needs to be
specified in `build.gradle`.
- `memScoped` and `defer` are used to ensure native allocations are released after use
- If a web request fails, the exception messages are not necessarily as clear as the ones from the JVM.
