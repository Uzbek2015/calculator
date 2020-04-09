pipeline {
    agent {
        label 'generic'
    }
    stages {
        stage("setup script") {
            steps {
                sh """ 
                     pip3 install --upgrade pytest --jenkins
                     pip3 install pytest --jenkins
                """
        
            } // steps
        } // stage
        stage(" Run unit tests") {
            steps {
                sh """ 
                    sudo python3 -m pytest
                """
            } //steps
        } // stage
        stage("Deploy to another server") {
            steps {
                sh """ 
                    # // Package into rpm and upload
                """
            } // steps
        } // stage 
    } // stages
    post {
        always {
            sh """ 
                sudo pip3 uninstall pytest -y
            """
        } // always
    } // post
} //pipeline