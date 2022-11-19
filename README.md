## Проект по автоматизации тестирования сайта hh.ru

##	Содержание

- [Технологии и инструменты](#-Технологии-и-инструменты)
- [Реализованы проверки](#bookmark_tabs-реализованы-проверки)
- [Запуск тестов из терминала](#computer-Запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#jenkins-Запуск-тестов-в-Jenkins)
- [Отчет о результатах тестирования в Allure Report](#allure_report-Отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#-Интеграция-с-allure-testops)
- [Интеграция с Jira](#jira-Интеграция-с-jira)
- [Уведомления в Telegram с использованием бота](#telegram-Уведомления-в-telegram-с-использованием-бота)
- [Пример запуска теста в Selenoid](#selenoid-Пример-запуска-теста-в-selenoid)


## Технологии и инструменты

<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Selenoid" src="images/logo/Selenoid.svg"></code>
<code><img width="5%" title="Selenide" src="images/logo/Selenide.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/logo/Junit5.svg"></code>
<code><img width="5%" title="GitHub" src="images/logo/GitHub.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="images/logo/Allure_TO.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></code>
<code><img width="5%" title="Jira" src="images/logo/Jira.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>
</p>


## :bookmark_tabs: Реализованные проверки:

- Проверка результатов поиска работы 
- Проверка отображаения блока сервисов для соискателей 
- Проверка отображения дашборда с вакансиями
- Проверка отображения главной страницы 

## :computer: Запуск тестов из терминала

### Локальный запуск тестов

```bash
gradle clean test
```

### Удаленный запуск тестов

```bash
gradle clean test
-Dbrowser=${browser}
-DbrowserVersion=${browserVersion}
-DbrowserSize=${browserSize}
-DremoteUrl=${remoteUrl}
-Dthreads=${THREADS}
```

## Параметры сборки

 <code>browser</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).

 <code>browserVersion</code> – версия браузера (_по умолчанию - <code>100</code>_).

 <code>browserSize</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).

 <code>remoteUrl</code> – логин, пароль и адрес удаленного сервера Selenoid (_по умолчанию указаны в сборке Jenkins_).

 <code>THREADS</code> - параллельный запуск тестов (_по умолчанию - 5_).

## :jenkins: Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/hhru_15/)

Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать*</strong></code>.

<p align="center">
  <img src="images/jenkins.png" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report*, кликнув по которому, откроется страница с сформированным html-отчетом.

<p align="center">
  <img src="images/allure-report.png" alt="allure-report" width="800">
</p>


## :allure_report: Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/hhru_15/32/allure/)

<p align="center">
  <img src="images/allure-report1.png" alt="allure-report1" width="900">
</p>

## :allure_test_ops: Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/16913)

## Основной дашборд

<p align="center">
  <img src="images/dashboard.png" alt="dashboard" width="900">
</p>
 
## Тест-кейсы 

<p align="center">
  <img src="images/testcase.png" alt="testcase" width="900">
</p>

## :jira: Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-426)

<p align="center">
  <img src="images/jira.png" alt="jira" width="900">
</p>

## :telegram: Уведомления в Telegram с использованием бота
После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="images/telegram.png">
</p>

## :selenoid: Пример запуска теста в Selenoid

К каждому тесту в отчете прилагается видео.

<p align="center">
  <img title="Selenoid Video" src="images/gif/test.gif">
</p>