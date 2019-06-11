node {
    stage('Archive') {
        archive '**/target/*.jarss'
    }
    stage('Deploy') {
        echo "Deploy is not yet implemented"
    }
}
