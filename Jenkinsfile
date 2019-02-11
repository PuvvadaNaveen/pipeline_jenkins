node{
  stage('push'){
    properties([[$class: 'GithubProjectProperty', displayName: '', projectUrlStr: 'https://github.com/PuvvadaNaveen/pipeline_jenkins/'], pipelineTriggers([githubPush()])])
  }
stage('SCM Checkout'){
git 'https://github.com/PuvvadaNaveen/pipeline_jenkins'
}
stage('Compile-Package'){
sh 'mvn compile'
}
}
