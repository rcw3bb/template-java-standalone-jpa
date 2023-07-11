# JPA with Modern Java Template

A basic gradle project that demonstrates the use of standalone JPA *(Jakarta Persistence API)* with modern java *(i.e. modular)*. 

The **hibernate JPA implementation** is in use in this template.

## Pre-requisite

* Java 17

## Cloning

1. **Create a fork** of this repository.

2. **Clone the forked repository** to your machine.

3. **Test your cloned repository** using the following command:

   ```
   gradlew clean check
   ```

   > See the [BUILD.md](BUILD.md) test section.

## Package

### model

Must hold the **persistence model** of the application. 

In this template, a model of a user information is being used. To avoid the boilerplate of implementing all the setter and getter methods, **lombok** is being used for this.

## JPA configuration

The **persistence.xml** file holds the configuration for JPA. This file must be located in **META-INF directory** under **main resources**. 

## Main class

The Main class is the entry point of application.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## [Build](BUILD.md)

## [Changelog](CHANGELOG.md)

## Author

* Ronaldo Webb
