#! /bin/bash

DEBIAN_FRONTEND=noninteractive TZ=Asia/Shanghai apt install -y gawk wget git diffstat unzip texinfo gcc build-essential \
    chrpath socat cpio python3 python3-pip python3-pexpect xz-utils \
    debianutils iputils-ping python3-git python3-jinja2 libegl1-mesa \
    libsdl1.2-dev xterm python3-subunit mesa-common-dev zstd liblz4-tool \
    locales-all file tmux
    # pylint3

umask 000
git config --global init.defaultBranch master
git config --global safe.directory "*"
git config --global user.email example@example.com
git config --global user.name example
# export MACHINE=ccbox DISTRO=poky-rt DL_DIR=$(pwd)/downloads
source poky/oe-init-build-env arm_build
#
