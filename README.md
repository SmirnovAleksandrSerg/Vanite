# Vanite

![New Project](https://user-images.githubusercontent.com/29167110/158914920-32310149-7f76-4802-9745-6c5ecf05f335.png)


![](https://img.shields.io/badge/Project%20Status-Under%20Development-blue)
[![Maven Central](https://img.shields.io/maven-central/v/com.yazantarifi/vanite.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.yazantarifi%22%20AND%20a:%22vanite%22)
![](https://img.shields.io/badge/License-Apache%202.0-yellow)
![](https://img.shields.io/badge/Language-Kotlin-orange)
![](https://img.shields.io/badge/Android%20Status-AndroidX-green)


# Что такое Vanite

Vanite - это библиотека с открытым исходным кодом, которая фокусируется на предоставлении базового кода Android-приложений с утилитарными классами для общих случаев использования.
В рамках многомодульной архитектуры, начиная с управления состоянием и заканчивая утилитарными классами и предоставлением базового кода в базовых ViewModels, Fragments, Activities

### Многомодульное приложение
Библиотека фокусируется на основных модулях
1. UI
2. Data
3. Domain

Слой UI связывается с доменом для обработки логики от ViewModels, Use Cases и т.д., а этот слой связывается со слоем данных для получения данных из репозиториев. Эти слои могут быть представлены модулями или пакетами, потому что vanite построен на основе модулей, и вы можете добавить необходимую зависимость к одному модулю, как вы хотите.


### Компоненты потока приложений
1. Actions
2. State
3. ViewModel
4. User Interface

Пользовательский интерфейс связывается с ViewModel только методом execute и отправляет ViewModel действия, каждое действие должно выполнить определенный код или перейти к Use Case.
Затем ViewModel отвечает View с новым состоянием для этой ViewModel

Также необходимо предоставить классы-утилиты, насколько это возможно, для общих случаев использования

### Установка

1. Build.gradle Root File

```
allprojects {
    repositories {
        mavenCentral()
    }
}
```

2. Модули приложения

```
dependencies {
   implementation 'com.yazantarifi:vanite:2.0.0'
   implementation 'com.yazantarifi:vanite-data:2.0.0'
   implementation 'com.yazantarifi:vanite-utils:2.0.0'
   implementation 'com.yazantarifi:vanite-ui-binding:2.0.0'
   implementation 'com.yazantarifi:vanite-ui:2.0.0'
   implementation 'com.yazantarifi:vanite-prefs:2.0.0'
   implementation 'com.yazantarifi:vanite-permissions:2.0.0'
   implementation 'com.yazantarifi:vanite-log:2.0.0'
   implementation 'com.yazantarifi:vanite-firebase:2.0.0'
   implementation 'com.yazantarifi:vanite-secured-prefs:2.0.0'
   implementation 'com.yazantarifi:vanite-compose:2.0.0'
}
```

# Описание зависимостей библиотеки

Эта библиотека имеет 2 способа создания интеграции, сначала у нас есть приложения, построенные на основе XML, и другие приложения, построенные с помощью Jetpack Compose.
Эта библиотека поддерживает приложения Jetpack Compose под одной зависимостью, которая имеет базовый код для композитов 

Информация о зависимостях для приложений Jetpack Compose

```
    implementation 'com.yazantarifi:vanite-compose:2.0.0'
```

Информация о зависимостях для XML-приложений


```
   implementation 'com.yazantarifi:vanite:2.0.0'
   implementation 'com.yazantarifi:vanite-data:2.0.0'
   implementation 'com.yazantarifi:vanite-utils:2.0.0'
   implementation 'com.yazantarifi:vanite-ui-binding:2.0.0'
   implementation 'com.yazantarifi:vanite-ui:2.0.0'
```

Информация о зависимостях для утилитарных классов

```
   implementation 'com.yazantarifi:vanite-secured-prefs:2.0.0'
   implementation 'com.yazantarifi:vanite-firebase:2.0.0'
   implementation 'com.yazantarifi:vanite-log:2.0.0'
   implementation 'com.yazantarifi:vanite-permissions:2.0.0'
   implementation 'com.yazantarifi:vanite-utils:2.0.0'

```

# Лицензия

Copyright (C) 2019 Vanite is An Open Source Library (Licensed under the Apache License, Version 2.0)

