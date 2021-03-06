/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.util.ArrayList;
import javafx.stage.FileChooser;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import objects.MP3;
import utils.FileUtils;
import utils.MP3PlayerFileFilter;
import utils.SkinUtils;

/**
 *
 * @author Tim
 */
public class MP3PlayerGui extends javax.swing.JFrame {

    private static final String MP3_FILE_EXTENSION = "mp3";
    private static final String MP3_FILE_DESCRIPTION = "Файлы mp3";
    private static final String MP3_PLAYLIST_EXTENSION="pls";
    private static final String MP3_PLAYLIST_DESCRIPTION="Файлы pls";
    private static final String EMTRY_STRING="";
    private static final String INPUT_SONG_NAME="Введите имя песни"; 
    
    private DefaultListModel mp3ListModel = new DefaultListModel();
    private final FileFilter mp3FileFilter = new MP3PlayerFileFilter(MP3_FILE_EXTENSION,MP3_FILE_DESCRIPTION);
    private final FileFilter plsFileFilter=new MP3PlayerFileFilter(MP3_PLAYLIST_EXTENSION, MP3_PLAYLIST_DESCRIPTION);

    /**
     * Creates new form MP3PlayerGui
     */
    public MP3PlayerGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        panelMain = new javax.swing.JPanel();
        btnStopSong = new javax.swing.JButton();
        btnPauseSong = new javax.swing.JButton();
        btnPlaySong = new javax.swing.JButton();
        btnNextSong = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPlayList = new javax.swing.JList();
        slideVolume = new javax.swing.JSlider();
        tglbtnVolume = new javax.swing.JToggleButton();
        btnPrevSong = new javax.swing.JButton();
        btnAddSong = new javax.swing.JButton();
        btnDeleteSong = new javax.swing.JButton();
        btnSelectPrev = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnSelectNext = new javax.swing.JButton();
        panelSearch = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpenPlaylist = new javax.swing.JMenuItem();
        menuSavePlaylist = new javax.swing.JMenuItem();
        menuSeparator = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        menuPrefs = new javax.swing.JMenu();
        menuChangeSkin = new javax.swing.JMenu();
        menuSkin1 = new javax.swing.JMenuItem();
        menuSkin2 = new javax.swing.JMenuItem();

        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setMultiSelectionEnabled(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MP3 плеер");
        setResizable(false);

        panelMain.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnStopSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_stop_black_18dp.png"))); // NOI18N
        btnStopSong.setToolTipText("Остановить");

        btnPauseSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_pause_black_18dp.png"))); // NOI18N
        btnPauseSong.setToolTipText("Пауза");

        btnPlaySong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_play_arrow_black_18dp.png"))); // NOI18N
        btnPlaySong.setToolTipText("Воспроизвести");
        btnPlaySong.setName("btnPlay"); // NOI18N
        btnPlaySong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaySongActionPerformed(evt);
            }
        });

        btnNextSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_skip_next_black_18dp.png"))); // NOI18N
        btnNextSong.setToolTipText("Следующая песня");

        lstPlayList.setModel(mp3ListModel);
        lstPlayList.setToolTipText("Список песен");
        jScrollPane2.setViewportView(lstPlayList);

        slideVolume.setMaximum(6);
        slideVolume.setToolTipText("Изменить громкость");
        slideVolume.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tglbtnVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/speaker.png"))); // NOI18N
        tglbtnVolume.setToolTipText("Выключить звук");
        tglbtnVolume.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mute.png"))); // NOI18N

        btnPrevSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_skip_previous_black_18dp.png"))); // NOI18N
        btnPrevSong.setToolTipText("Предыдущая песня");

        btnAddSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_add_black_18dp.png"))); // NOI18N
        btnAddSong.setToolTipText("Добавить песню");
        btnAddSong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddSong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAddSong.setName("btnAddSong"); // NOI18N
        btnAddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSongActionPerformed(evt);
            }
        });

        btnDeleteSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_clear_black_18dp.png"))); // NOI18N
        btnDeleteSong.setToolTipText("Удалить песню");
        btnDeleteSong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDeleteSong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDeleteSong.setName("btnAddSong"); // NOI18N
        btnDeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSongActionPerformed(evt);
            }
        });

        btnSelectPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_keyboard_arrow_down_black_18dp.png"))); // NOI18N
        btnSelectPrev.setToolTipText("Выделить следующую песню");
        btnSelectPrev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSelectPrev.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSelectPrev.setName("btnAddSong"); // NOI18N
        btnSelectPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPrevActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnSelectNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_keyboard_arrow_up_black_18dp.png"))); // NOI18N
        btnSelectNext.setToolTipText("Выделить предыдущую песню");
        btnSelectNext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSelectNext.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSelectNext.setName("btnAddSong"); // NOI18N
        btnSelectNext.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnSelectNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnAddSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteSong)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelectPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelectNext))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(tglbtnVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(btnPrevSong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlaySong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPauseSong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStopSong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(slideVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSelectPrev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2)
                        .addComponent(btnSelectNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAddSong, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeleteSong, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slideVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglbtnVolume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlaySong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPauseSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStopSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNextSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrevSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_search_black_18dp.png"))); // NOI18N
        btnSearch.setText("Найти");
        btnSearch.setToolTipText("Найти песню");
        btnSearch.setActionCommand("search");
        btnSearch.setName("btnSearch"); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("введите имя песни");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch))
                .addContainerGap())
        );

        menuFile.setText("Файл");

        menuOpenPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-icon.png"))); // NOI18N
        menuOpenPlaylist.setText("Открыть плейлист");
        menuOpenPlaylist.setName(""); // NOI18N
        menuOpenPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenPlaylistActionPerformed(evt);
            }
        });
        menuFile.add(menuOpenPlaylist);

        menuSavePlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_16.png"))); // NOI18N
        menuSavePlaylist.setText("Сохранить плейлист");
        menuSavePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSavePlaylistActionPerformed(evt);
            }
        });
        menuFile.add(menuSavePlaylist);
        menuFile.add(menuSeparator);

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        menuExit.setText("Выход");
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        menuPrefs.setText("Сервис");

        menuChangeSkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gear_16.png"))); // NOI18N
        menuChangeSkin.setText("Внешний вид");

        menuSkin1.setText("Скин 1");
        menuSkin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSkin1ActionPerformed(evt);
            }
        });
        menuChangeSkin.add(menuSkin1);

        menuSkin2.setText("Скин 2");
        menuSkin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSkin2ActionPerformed(evt);
            }
        });
        menuChangeSkin.add(menuSkin2);

        menuPrefs.add(menuChangeSkin);

        jMenuBar1.add(menuPrefs);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(344, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSkin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSkin1ActionPerformed
        SkinUtils.changeSkin(this, UIManager.getSystemLookAndFeelClassName());
    }//GEN-LAST:event_menuSkin1ActionPerformed

    private void menuSkin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSkin2ActionPerformed
        SkinUtils.changeSkin(this, new NimbusLookAndFeel());
    }//GEN-LAST:event_menuSkin2ActionPerformed

    private void btnAddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSongActionPerformed
        FileUtils.addFileFilter(jFileChooser1, mp3FileFilter);//устанваливаем FileFilter
        int result = jFileChooser1.showOpenDialog(this);

        if (result == jFileChooser1.APPROVE_OPTION) {//если нажата ОК
            File[] selectedFiles = jFileChooser1.getSelectedFiles();

            for (File selectedFile : selectedFiles) {
                MP3 mp3 = new MP3(selectedFile.getName(), selectedFile.getPath());
                mp3ListModel.addElement(mp3);
            }
        }

    }//GEN-LAST:event_btnAddSongActionPerformed

    private void btnDeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSongActionPerformed
        int []indexPlyList=lstPlayList.getSelectedIndices();
        if(indexPlyList.length>0){
            ArrayList<MP3>mp3ListForRemove=new ArrayList<>();
            for (int i = 0; i < indexPlyList.length; i++) {
                MP3 mp3=(MP3)mp3ListModel.getElementAt(i);
                mp3ListForRemove.add(mp3);
            }
            for (MP3 mp3 : mp3ListForRemove) {
                mp3ListModel.removeElement(mp3);
            }
        }
    }//GEN-LAST:event_btnDeleteSongActionPerformed

    private void btnSelectPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPrevActionPerformed
        int nextIndex=lstPlayList.getSelectedIndex()+1;
        if(nextIndex>=0){
        lstPlayList.setSelectedIndex(nextIndex);
        }
    }//GEN-LAST:event_btnSelectPrevActionPerformed

    private void btnSelectNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectNextActionPerformed
       int nextIndex=lstPlayList.getSelectedIndex()-1;
        if(nextIndex<=lstPlayList.getModel().getSize()-1){
        lstPlayList.setSelectedIndex(nextIndex);
        }
        
    }//GEN-LAST:event_btnSelectNextActionPerformed

    private void btnPlaySongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaySongActionPerformed
    int [] indexSelected=lstPlayList.getSelectedIndices();
    if(indexSelected.length>0){
    MP3 mp3=(MP3) mp3ListModel.getElementAt(indexSelected[0]);
        System.out.println(mp3.getPath());}
    }//GEN-LAST:event_btnPlaySongActionPerformed

    private void menuSavePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSavePlaylistActionPerformed
    FileUtils.addFileFilter(jFileChooser1, plsFileFilter);
    int result=jFileChooser1.showOpenDialog(this);
    if(result==jFileChooser1.APPROVE_OPTION){//если нажата кнопка ОК
        File selectedFile=jFileChooser1.getSelectedFile();
        if(selectedFile.exists()){//если такой файл уже существует
            int resultOvveride=JOptionPane.showConfirmDialog(this,"Файл существует","Перезаписать?",JOptionPane.YES_NO_CANCEL_OPTION);
            switch(resultOvveride){
                case JOptionPane.NO_OPTION:
                    menuSavePlaylistActionPerformed(evt);//повторно открыть окно
                    return;
                case JOptionPane.CANCEL_OPTION:
                    jFileChooser1.cancelSelection();
                    return;
            }
            jFileChooser1.approveSelection();
        }
        String fileExtenption=FileUtils.getFileExtension(selectedFile);
        //имя файла (нужно ли в конце добавлять расширение)
       String nameForFileSave=(fileExtenption!=null && fileExtenption.equals(MP3_PLAYLIST_EXTENSION)?selectedFile.getPath():selectedFile.getPath()+"."+MP3_PLAYLIST_EXTENSION);
       FileUtils.serialize(mp3ListModel, nameForFileSave);
    }
    }//GEN-LAST:event_menuSavePlaylistActionPerformed

    private void menuOpenPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenPlaylistActionPerformed
    FileUtils.addFileFilter(jFileChooser1, plsFileFilter);
    int result=jFileChooser1.showOpenDialog(this);//result хранит результат:выбран файл или нет
    
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=jFileChooser1.getSelectedFile();
            DefaultListModel mp3ListModel1=(DefaultListModel)FileUtils.deserialize(selectedFile.getPath());
            mp3ListModel=mp3ListModel1;
            lstPlayList.setModel(mp3ListModel);
        }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_menuOpenPlaylistActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    String searchStr=txtSearch.getText();
    if(searchStr==null||searchStr.equals(EMTRY_STRING)){
    return;
    }
    //все индексы файлов будет сохранены в массиве 
    ArrayList<Integer>mp3finderIndexec=new ArrayList<>();
    
        for (int i = 0; i < mp3finderIndexec.size(); i++) {
           MP3 mp3=(MP3)mp3ListModel.getElementAt(i);
           if(  mp3.getName().toUpperCase().contains(searchStr.toUpperCase())){
           mp3finderIndexec.add(i);
           }
        }
           //колекцию индексов сохраняем в масиве
           int [] selectedIndexec=new int[mp3finderIndexec.size()];
           
           if(selectedIndexec.length==0){
           JOptionPane.showMessageDialog(this,"Поиск по строке \'"+searchStr+"\' не дал резудьтат");
           txtSearch.requestFocus();
           txtSearch.selectAll();
           return;
           }
           
            for (int j = 0; j < selectedIndexec.length; j++) {
                selectedIndexec[j]=mp3finderIndexec.get(j).intValue();
            }
            lstPlayList.setSelectedIndices(selectedIndexec);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
       if(txtSearch.getText().trim().equals(EMTRY_STRING)){
       txtSearch.setText(INPUT_SONG_NAME);}
    }//GEN-LAST:event_txtSearchFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MP3PlayerGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSong;
    private javax.swing.JButton btnDeleteSong;
    private javax.swing.JButton btnNextSong;
    private javax.swing.JButton btnPauseSong;
    private javax.swing.JButton btnPlaySong;
    private javax.swing.JButton btnPrevSong;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectNext;
    private javax.swing.JButton btnSelectPrev;
    private javax.swing.JButton btnStopSong;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList lstPlayList;
    private javax.swing.JMenu menuChangeSkin;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuOpenPlaylist;
    private javax.swing.JMenu menuPrefs;
    private javax.swing.JMenuItem menuSavePlaylist;
    private javax.swing.JPopupMenu.Separator menuSeparator;
    private javax.swing.JMenuItem menuSkin1;
    private javax.swing.JMenuItem menuSkin2;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JSlider slideVolume;
    private javax.swing.JToggleButton tglbtnVolume;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}
