#!/usr/bin/env groovy

node {
    stage('Build and Test') {
        properties([pipelineTriggers([[$class: 'GitHubPushTrigger'], pollSCM('H/15 * * * *')])])
        checkout scm
        sh 'mvn clean build'
    }
}
