all:
	ant build
test:
	ant Tests
run:
	ant Calc
clean:
	ant clean;
	if [ -f xfilip34_xdenkf00_xkudrn02_xsimek22.zip ]; then rm  xfilip34_xdenkf00_xkudrn02_xsimek22.zip; fi;
pack:
	git archive -o xfilip34_xdenkf00_xkudrn02_xsimek22.zip HEAD
doc:
	doxygen
