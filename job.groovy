pipeline {
    /* Ваши инструкции для конвейера */

    agent {label "master" }

    stages {

        stage('Build') {
            steps {script {
                sleep 38
                echo "Application succesfully builded"
            }}
        }

        stage('Tests') {
            steps {script {
                sleep 15
                echo "Test run succesfully"
            }}
        }

        stage('Deploy') {
            steps {script {
                sleep 53
                echo "Application deployed into servers"
            }}
        }
    }
}
