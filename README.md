[![Platform](https://img.shields.io/badge/platform-android-brightgreen)](https://developer.android.com/reference)

![banner](art/Complete-Dagger2.jpg)

## (MVVM + Dagger2 + Coroutines + Flows)

This is one of the different 'Checkout & Code' templates developed in order to facilitate the foundation work applied in the beginning of any project.

![diagram](art/Clean-Architecture-Diagram.jpg)

## Getting Started :vertical_traffic_light:

1. Checkout the repo.
2. Sync Project with Gradle Files.
3. Add any dependency that you need in **buildSrc -> Dependencies.kt**.
4. Modify **app-> FirstFragment** as you want and add any others in the same module.
5. Modify **presentation -> FirstViewModel** as you want and add any others in the same module.
6. Modify **domain -> GetSampleUseCase** in order to customise the use cases that you need. There's a sample unit test included, according to the given sample.
7. Modify **data and data-remote** according to your project requirements. There are unit tests included too, regarding to the given sample.
6. Enjoy! :surfer:


## Add a new module :heavy_plus_sign: (optional)

1. Second click on Clean-Architecture-Template structure and select New -> module.
2. When the module is added to the project, make sure you include it in **settings.gradle.kts** and **DELETE settings.gradle** file generated, because it won't be needed.
3. Compile the project
4. Include the module in **app -> build.gradle.kts**


## Modules :department_store:

* **app** - The application module with access to **all the application**
* **buildSrc** - Kotlin module that contains the **Dependencies** class and the **AndroidPlugin** that will simplify the build gradle files in every single module defined.
* **core** - Android module that contains the Injecting VM Factory and the needed DI basic annotations **(it can't access any other module)**.
* **core-android-test** - Tests classes module (rules, date builders,etc.) that **cannot access any other module**.
* **data** - Android module that **can only access domain module**. Contains the repository pattern implementation and mappers that allow to communicate with different sources.
* **data-api** - Android module that **can only access data module**. Contains the remote calls abstraction of your app.
* **domain** - Kotlin module that **cannot access any other module**. Contains the use cases (the entire business logic of your app).
* **navigation** - Android jetpack navigation abstraction (it contains the navigation config file) **cannot access any other module**
* **presentation** - Android module that contains the UI model and VMs used in the app


#  License :oncoming_police_car:

    Copyright 2020 Fernando Prieto Moyano

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.