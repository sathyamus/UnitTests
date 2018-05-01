// Jenkinsfile
// ----------------------------------------------------------------------
// pipeline script for checkout, build and deploy
// ----------------------------------------------------------------------
pipeline {
    agent any
	// populating environment variables
	environment {
        DISABLE_AUTH = 'true'
        ARTIFACT_ID = readMavenPom().getArtifactId()
        APPL_VERSION = readMavenPom().getVersion()
		PACKAGING = readMavenPom().getPackaging()
		APP_VERSION = "$ARTIFACT_ID-$APPL_VERSION.$PACKAGING"
    }
	parameters {
        string(name: 'URL', defaultValue: 'https://github.com/jenkins-docs/simple-java-maven-app.git', description: 'Github URL?')
		string(name: 'ARTIFACT_ID', defaultValue: '$ARTIFACT_ID', description: 'Artifact Id')
		string(name: 'APPL_VERSION', defaultValue: '$APPL_VERSION', description: 'Version')
    }
    stages {
		stage('Check versions') {
            steps {
                sh 'mvn --version'
                sh 'java -version'
                sh 'node --version'
                sh 'npm --version'
            }
        }
        stage('List environment variables') {
            steps {
				sh 'printenv'
            }
        }
		stage('Checkout Git repository') {
			steps {
				git branch: 'master', url: "${params.URL}"
			}
		}
		stage('Build') {
			steps {
				sh 'mvn -B -DskipTests clean package'
			}
		}
		stage('Deploy') {
			steps {
			    echo "$APPL_VERSION"
			    echo "$ARTIFACT_ID-$APPL_VERSION.$PACKAGING"
				sh 'echo ${POM_VERSION}'
				sh 'java -jar ./target/$APP_VERSION'
			}
		}
    }
}