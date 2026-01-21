JAVAC=javac
JAVA=java
SRC_DIR=src
BIN_DIR=bin
MAIN_CLASS=Main

SOURCES=$(wildcard $(SRC_DIR)/*.java)
CLASSES=$(SOURCES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)

all: compile run

compile: $(BIN_DIR) $(CLASSES)

$(BIN_DIR):
	mkdir -p $(BIN_DIR)

$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	$(JAVAC) -d $(BIN_DIR) $<

run:
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

clean:
	rm -rf $(BIN_DIR)
