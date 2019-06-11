node {
    stage('Archive') {
        archive '**/target/*.jarsss'
    }
    stage('Deploy') {
        echo "Deploy is not yet implemented"
    }
}
