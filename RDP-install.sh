sudo apt install remmina-plugin-rdp -y
sudo apt install openjdk-17-jdk -y
sudo apt-get install openssh-client -y
sudo mkdir -p ~/.local/share/remmina
sudo apt remove galculator -y
sudo apt remove chromium-* -y
sudo apt remove pcmanfm -y
mv USERS.txt ~
mv RDP.jar ~
mv RDP.sh ~/Desktop
chmod 777 ~/Desktop/RDP.sh
mv remmina.pref ~/.config/remmina/
mv test.remmina ~/.local/share/remmina/
mv rdp.desktop ~/.config/autostart/rdp.desktop
mv lxde-rc.xml ~/.config/openbox/
sed -i '/@lxpanel --profile LXDE/s/^/#/' /etc/xdg/lxsession/LXDE/autostart
sudo reboot
