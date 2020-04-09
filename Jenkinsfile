pipeline {
    agent {
        label 'generic'
    }
    stages {
        stage("setup script") {
            steps {
                sh """ 
                    pip install pytest
                """
        
            } // steps
        } // stage
        stage(" Run unit tests") {
            steps {
                sh """ 
                    python -m pytest
                """
            } //steps
        } // stage
    } // stages
    post {
        always {
            sh """ 
                pip uninstall pytest -y
            """
        } // always
    } // post
} //pipeline