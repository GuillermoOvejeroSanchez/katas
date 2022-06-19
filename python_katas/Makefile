current-dir := $(dir $(abspath $(lastword $(MAKEFILE_LIST))))
SHELL = /bin/sh

start:
	@if [ -z $(shell which pipenv) ]; then echo "ERROR: missing software required (pip install pipenv)" > /dev/stderr && exit 1; fi
	@PIPENV_VENV_IN_PROJECT=1 pipenv install --dev

format: 
	@pipenv run black
	@pipenv run isort

format-check:
	@pipenv run pep8
	@pipenv run check-isort
	@pipenv run check-black

typing-check:
	@pipenv run mypy

complexity-check: 
	@pipenv run flake8 --max-complexity 4 |  grep complex

run:
	@echo Running project...
	@echo This will load .env parameters
	@bash -c "set -o allexport; set +o allexport && pipenv run trigger && pipenv run notification"

test:
	@bash -c "pipenv run test"


PHONY: start run test format
