pipeline {
agent any
triggers {

githubPush()
}
stages {
stage('Clone') {
steps {

git branch: 'main', url: 'https://github.com/JayZawar98/sample.git'

}
}
stage('Build') {
steps {
bat 'javac Game.java'
bat 'javac Main.java'
}
}
stage('Run') {
steps {
bat 'java Main'
}
}
}
}
