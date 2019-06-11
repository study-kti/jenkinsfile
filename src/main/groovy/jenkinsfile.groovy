node {
    stage('Archive') {
        archive '**/target/*.jarssss'
    }
    stage('Deploy') {
        echo "Deploy is not yet implemented"
    }
    stage('Deploy1') {
        echo "Deploy is not yet implemented"
    }
}
