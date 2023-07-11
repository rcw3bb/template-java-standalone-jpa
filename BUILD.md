# Build

## Pre-requisite

* Java 17

## Testing

Run the following command to test the application:

```
gradlew clean check
```

> The preceding command must be run from the location where you've cloned the repository.

## Building

Run the following command to build the application:

```
gradlew jlink
```

> The preceding command must be run from the location where you've cloned the repository.

The output of this task will be in the following directory format:

```
build\standalone-jpa-<VERSION>
```

From the preceding directory you can test the build by running the following batch file found in the **bin directory**:

```
standalone-jpa.bat
```

Inspect the log with the following entry:

```
Saved User: John Doe
```

> If the preceding entry exists, it means everything is working.

> When running the standalone-jpa expect to see the following warning:
>
> ```
> WARN: HHH10000002: File or directory named by URL [jrt:/sample.module.jpa] could not be found.  URL will be ignored
> java.io.IOException: cannot connect to jrt:/sample.module.jpa
> ```

