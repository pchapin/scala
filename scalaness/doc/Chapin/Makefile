#
# Makefile for the Chapin dissertation
#

SOURCES=abstract.tex              \
	acknowledgements.tex      \
	Conclusion.tex            \
	dedication.tex            \
	Evaluation.tex            \
	Introduction.tex          \
	macros.tex                \
	main.tex                  \
	packages.tex              \
	Scalaness-Mininess-Implementation.tex \
	Scalaness-nesT-Theory.tex \
	SpartanRPC-Sprocket.tex   \
	Trust-Management.tex

FIGURES=figures.tex                           \
	Figures/Authorization-Interfaces.tex  \
	Figures/Certificate-Daemon.tex        \
	Figures/Certificate-Formats.tex       \
	Figures/Certificate-Receiver-Flowchart.tex \
	Figures/Post-Format.tex               \
	Figures/SessionKey-Daemon.tex         \
	Figures/SessionKey-Format.tex         \
	Figures/SnowStorm.tex                 \
	Figures/SprocketRT-Protocol.tex       \
	Figures/brainbox.eps                  \
	Figures/harvester.eps                 \
	Figures/tmstruct.eps                  \
	Figures/tower.eps

main.pdf:	$(SOURCES) $(FIGURES)
	latex main
	dvips main
	ps2pdf main.ps main.pdf

full:	$(SOURCES) $(FIGURES)
	latex main
	bibtex main
	latex main
	latex main
	dvips main
	ps2pdf main.ps main.pdf

clean:
	rm -f *.aux main.bbl main.blg main.dvi main.lof main.log main.lot main.out main.pdf main.ps main.toc
