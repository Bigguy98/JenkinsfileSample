pipeline {
    agent any 
    parameters {
        string(name: 'APP_NAME', defaultValue: 'Bugsmaker App', description: 'App name')
        choice(name: 'VERSION', choices: ['v1.0', 'v1.1', 'v1.2'], description: 'App version')
        booleanParam(name: 'NEED_TEST', defaultValue: true, description: 'Check if this deployment need to be test')
    }
    stages {
        stage('Building') {
            steps {
                echo "Building app..."
            }  
        }
        stage('Test') {
            when {
                expression {
                    params.NEED_TEST
                }
            }
            steps {
                echo "Testing app..."
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying app..."
            }
        }

    }

    post {
        always {
            echo "Always echo this"
        }
        failure {
            echo "deploy fail"
        }
        success {
            echo "deploy success"
        }
    }
}