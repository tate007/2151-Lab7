default: compile

compile:
	javac -sourcepath . cpsc2150/listDec/ShuffleApp.java

run:
	java cpsc2150.listDec.ShuffleApp

clean:
	rm -f cpsc2150/listDec/*.class
