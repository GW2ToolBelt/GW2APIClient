#!/bin/bash

#
# Copyright (c) 2018-2022 Leon Linhart
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
#

# Fail on any error
set -ex

DOCS_ROOT=build/mkdocs/sources

[ -d $DOCS_ROOT ] && rm -r $DOCS_ROOT
mkdir -p $DOCS_ROOT

# Clear out the old API docs
[ -d $DOCS_ROOT/api ] && rm -r $DOCS_ROOT/api
# Build the docs with dokka
./gradlew dokkaHtmlMultiModule --stacktrace

# Create a copy of our docs at our $DOCS_ROOT
cp -a docs/* $DOCS_ROOT

cp README.md $DOCS_ROOT/index.md
cp .github/CONTRIBUTING.md $DOCS_ROOT/contributing.md

sed -i.bak 's/CONTRIBUTING.md/contributing/' $DOCS_ROOT/index.md
sed -i.bak 's/README.md//' $DOCS_ROOT/index.md

# Convert docs/mkdocs/xxx.md links to just xxx/
sed -i.bak 's/docs\/\([a-zA-Z-]*\).md/\1/' $DOCS_ROOT/index.md

# Finally delete all of the backup files
find . -name '*.bak' -delete