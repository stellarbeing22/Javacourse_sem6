JAVAC=javac
JAVA=java
SRC_DIR=src
BIN_DIR=bin
FILE=Hello

SRC_FILE=$(SRC_DIR)/$(FILE).java
CLASS_FILE=$(BIN_DIR)/$(FILE).class

all: compile run

$(BIN_DIR):
	mkdir -p $(BIN_DIR)

compile: $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SRC_FILE)

run:
	$(JAVA) -cp $(BIN_DIR) $(FILE)

clean:
	rm -rf $(BIN_DIR)
