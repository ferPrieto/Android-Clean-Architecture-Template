[![Platform](https://img.shields.io/badge/platform-android-brightgreen)](https://developer.android.com/reference)

![banner](art/Simplified-Dagger2.jpg)

## (MVVM + Dagger2)

This is one of the different 'Checkout & Code' templates developed in order to facilitate the foundation work applied in the beginning of any project.
**Domain**, **Data**, **Data-API** and **Core-Android-Test** modules have been removed in this reduced version for **simplicity!**


## Getting Started :vertical_traffic_light:

:one:$~~$Checkout the repo<br/>
:two:$~~$Sync Project with Gradle Files<br/>
:three:$~~$Add any dependency that you need in **buildSrc -> Dependencies.kt**<br/>
:four:$~~$Modify **app-> FirstFragment** as you want and add any others in the same module<br/>
:five:$~~$Modify **presentation -> FirstViewModel** as you want and add any others in the same module<br/>
:six:$~~$Enjoy!<br/>


## Add a new module :heavy_plus_sign: (optional)

:one:$~~$Second click on Clean-Architecture-Template structure and select New -> module.<br/>
:two:$~~$When the module is added to the project, make sure you include it in **settings.gradle.kts** and **DELETE settings.gradle** file generated, because it won't be needed.<br/>
:three:$~~$Compile the project<br/>
:four:$~~$Include the module in **app -> build.gradle.kts**<br/>

## Modules :department_store:

* **app** - The application module with access to **all the application**
* **buildSrc** - Kotlin module that contains the **Dependencies** class and the **AndroidPlugin** that will simplify the build gradle files in every single module defined.
* **core** - Android module that contains the Injecting VM Factory and the needed DI basic annotations **(it can't access any other module)**
* **presentation** - Android module that contains the UI model and VMs used in the app
* **navigation** - Android jetpack navigation abstraction (it contains the navigation config file) **cannot access any other module**


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