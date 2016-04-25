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
	git archive -o xfilip34_xdenkf00_xkudrn02_xsimek22.zip HEAD
doc:
	doxygen
