#! /bin/sh

doConvert() {
    for i in *.svg; do
	inkscape -D -z --file=$i --export-pdf=${i%.svg}.pdf;
    done
}

cd $(dirname $0)/icons/files
doConvert

cd ../components
doConvert

cd ../
doConvert
