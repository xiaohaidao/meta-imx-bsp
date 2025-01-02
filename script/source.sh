#! /bin/bash

sed 's/archive.ubuntu.com/mirrors.tuna.tsinghua.edu.cn/g' /etc/apt/sources.list -i
apt update
apt install -y g++ python3 pkg-config curl make git cmake vim ninja-build \
    #qemu-system-arm

DEBIAN_FRONTEND=noninteractive TZ=Asia/Shanghai \
apt install -y gawk wget git diffstat unzip texinfo gcc build-essential \
    chrpath socat cpio python3 python3-pip python3-pexpect xz-utils \
    debianutils iputils-ping python3-git python3-jinja2 libegl1-mesa \
    libsdl1.2-dev xterm python3-subunit mesa-common-dev zstd liblz4-tool \
    locales-all file tmux libncurses-dev libelf-dev
    # pylint3


# book: https://e.coding.net/weidongshan/01_all_series_quickstart.git
# book: https://e.coding.net/weidongshan/linux/doc_and_source_for_drivers.git

umask 000
git config --global init.defaultBranch master
git config --global safe.directory "*"
git config --global user.email example@example.com
git config --global user.name example
# export MACHINE=ccbox|gen-x86_64
export BB_ENV_PASSTHROUGH_ADDITIONS="DL_DIR SSTATE_DIR"
export DL_DIR=$(pwd)/downloads
export SSTATE_DIR=$(pwd)/sstate-cache
 
# source poky/oe-init-build-env arm_build
# bitbake rt-image
# bitbake package-index
# bitbake rt-image -c devshell
# bitbake rt-image -c pydevshell
# bitbake rt-image -c populate_sdk
# bitbake rt-image -c populate_sdk_ext
# PROMPT_DIRTRIM=3
#
