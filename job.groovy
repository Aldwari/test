pipeline {
    /* Ваши инструкции для конвейера */
}
agent {label "test_unit" }

stages {

    stage('Build') {
        steps {script {
            sleep 15
            echo "Приложение успешно собралось"
        }}
    }

    stage('Tests') {
        steps {script {
            sleep 15
            echo "Тесты прошли успешно"
        }}
    }

    stage('Deploy') {
        steps {script {
            sleep 15
            echo "Приложение развернулось на серверах"
        }}
    }
}