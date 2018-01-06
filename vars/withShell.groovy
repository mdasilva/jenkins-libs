
// vars/withShell.groovy
def call(Closure body) {
	body()
	pwd
}
