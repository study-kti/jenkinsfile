node {
    stage('Archive') {
        archive '**/target/*.jar'
    }
    stage('Deploy') {
        echo "Deploy is not yet implemented"
    }
}
