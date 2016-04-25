all:
	ant build
test:
	ant Tests
run:
	ant Calc
clean:
	ant clean;
	rm xfilip34_xdenkf00_xkudrn02_xsimek22.zip
pack:
	zip xfilip34_xdenkf00_xkudrn02_xsimek22.zip dokumentace.pdf build.xml src lib mockup img body.txt README.md
